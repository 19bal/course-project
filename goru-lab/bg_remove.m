function bw = bg_remove(fg, mn, st)
    % Example using:   bg_remove('006.mpg', '002.mpg')

    % [mn st] = bg_model(bg);
    reader = mmreader(fg);                  % videoyu framelerine ay�rmak i�in okuma de�i�kenine ata
    N = get(reader, 'numberOfFrames') - 1;  % video i�erisinde ka� frame oldu�unu ata
    frames = read(reader, [1, N]);          % videonun N adet frameni oku ve ata

    [R, C, L] = size(frames(:, :, :, 1));   % frameler i�in sat�r ve s�tun say�lar�n� al (R=sat�r say�s� ve C=s�tun say�s� olarak ata)

    k = 26;
    for i = 1 : N
        F1 = double(mn(:, :, 1)) - k*st(:, :, 1); % her framenin k�rm�z� de�erlerinin ortalama k�rm�z� de�erlerden fark�n� al
        T1 = double(mn(:, :, 1)) + k*st(:, :, 1); % her framenin k�rm�z� de�erlerinin ortalama k�rm�z� de�erlerden fark�n� al        
        F2 = double(mn(:, :, 2)) - k*st(:, :, 2); % her framenin ye�il de�erlerinin ortalama ye�il de�erlerden fark�n� al
        T2 = double(mn(:, :, 2)) + k*st(:, :, 2); % her framenin ye�il de�erlerinin ortalama ye�il de�erlerden fark�n� al
        F3 = double(mn(:, :, 3)) - st(:, :, 3); % her framenin mavi de�erlerinin ortalama mavi de�erlerden fark�n� al
        T3 = double(mn(:, :, 3)) + st(:, :, 3); % her framenin mavi de�erlerinin ortalama mavi de�erlerden fark�n� al

        Y = ones(R, C);
        P1 = frames(:, :, 1, i);
        P2 = frames(:, :, 2, i);
        P3 = frames(:, :, 3, i);

        Y((T1 >= P1 & P1 >= F1) & (T2 >= P2 & P2 >= F2)) = 0;

        se = strel('disk', 5);
        Y = imopen(Y, se);
        Y = imclose(Y, se);

        label = bwlabel(Y);
        s = regionprops(label, 'Area');
        id = find([s.Area] > 900);
        Y = ismember(label, id);
        bw{i} = Y;
    end
end