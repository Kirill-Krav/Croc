package Homework2;

public class Main {
    public static void main(String[] args){
        //создание песен
        Song song1 = new Song("NAME1", "SONG1");
        Song song2 = new Song("NAME2", "SONG2");
        Song song3 = new Song("NAME3", "SONG3");
        Song song4 = new Song("NAME4", "SONG4");
        Song song5 = new Song("NAME5", "SONG5");

        //создание носителя, флешки, размер которой равен 10
        FlashMedia flash = new FlashMedia(10);

        //запись песен на флешку
        flash.writeSong(song1);
        flash.writeSong(song2);
        flash.writeSong(song3);
        flash.writeSong(song4);
        flash.writeSong(song5);

        //создание звуковоспроизводящего устройства, "универсальный плеер", которое будет принмать флешки
        UniversalPlayer universalDevice = new UniversalPlayer();

        //установка флешки в универсальный плеер
        universalDevice.setMedia(flash);

        //произвести первую песню
        universalDevice.play();

        //произвести следующую песню(вторую)
        universalDevice.play();

        //произвести пятую песню
        universalDevice.play(5);

        //произвести следующую песню(первую, т.к. на носителе пять песен)
        universalDevice.play();

        //удаление второй песни
        flash.deleteSong(2);

        //произвести следующую песню(вторую)
        universalDevice.play();

        //неудачная попытка произвести не существующую песню(т.к. одна была удалена из носителя)
        universalDevice.play(5);

        //произвести четвертую песню
        universalDevice.play(4);

        //произвести следующую песню(первую, т.к. на носителе четыре песен)
        universalDevice.play();

        //создание устройства, пластинки, и размер которой равен 2
        VinylMedia vinyl = new VinylMedia(2);

        //запись двух песен на пластинку
        vinyl.writeSong(song1);
        vinyl.writeSong(song2);

        //неудачная попытка записи третьей песни, т.к. вместимость пластинки два
        vinyl.writeSong(song3);

        //удаление первой песни
        vinyl.deleteSong(1);

        //запись песни
        vinyl.writeSong(song3);

        //установка пластинки в универсальный плеер
        universalDevice.setMedia(vinyl);

        //неудачная попытка воспроизведение песни с пластинки на универсальном плеере, т.к. универсальный плеер не поддерживает пластинки
        universalDevice.play();

        //создание звуковоспроизводящего устройства, "виниловая вертушка", которое будет принмать пластинки
        VinylPlayer vinylDevice = new VinylPlayer();

        //установка поастинки в виниловую вертушку
        vinylDevice.setMedia(vinyl);

        //воспроизведение песен на виниловой вертушке
        vinylDevice.play();
        vinylDevice.play();
        vinylDevice.play();
    }
}
