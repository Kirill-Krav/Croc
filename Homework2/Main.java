package Homework2;

public class Main {
    public static void main(String[] args){
        //создание песен
        Song song1 = new Song("NAME1", "SONG1");
        Song song2 = new Song("NAME2", "SONG2");
        Song song3 = new Song("NAME3", "SONG3");
        Song song4 = new Song("NAME4", "SONG4");
        Song song5 = new Song("NAME5", "SONG5");

        //создание устройства, типом которого является флешка, и размер которого равен 10
        Media media1 = new Media("флешка", 10);

        //запись песен на флешку
        media1.writeSong(song1);
        media1.writeSong(song2);
        media1.writeSong(song3);
        media1.writeSong(song4);
        media1.writeSong(song5);

        //создание звуковоспроизводящего устройства, название которого "универсальный плеер", и которое будет принмать флешки
        MusicalDevice musicalDevice1 = new MusicalDevice("Универсальный плеер", "флешка");

        //установка флешки в универсальный плеер
        musicalDevice1.setMedia(media1);

        //произвести первую песню
        musicalDevice1.play();

        //произвести следующую песню(вторую)
        musicalDevice1.play();

        //произвести пятую песню
        musicalDevice1.play(5);

        //произвести следующую песню(первую, т.к. на носителе пять песен)
        musicalDevice1.play();

        //удаление второй песни
        media1.deleteSong(2);

        //произвести следующую песню(вторую)
        musicalDevice1.play();

        //неудачная попытка произвести не существующую песню(т.к. одна была удалена из носителя)
        musicalDevice1.play(5);

        //произвести четвертую песню
        musicalDevice1.play(4);

        //произвести следующую песню(первую, т.к. на носителе четыре песен)
        musicalDevice1.play();

        //создание устройства, типом которого является пластинка, и размер которой равен 2
        Media media2 = new Media("пластинка", 2);

        //запись двух песен на пластинку
        media2.writeSong(song1);
        media2.writeSong(song2);

        //неудачная попытка записи третьей песни, т.к. вместимость пластинки два
        media2.writeSong(song3);

        //удаление первой песни
        media2.deleteSong(1);

        //запись песни
        media2.writeSong(song3);

        //установка пластинки в универсальный плеер
        musicalDevice1.setMedia(media2);

        //неудачная попытка воспроизведение песни с пластинки на универсальном плеере, т.к. универсальный плеер не поддерживает пластинки
        musicalDevice1.play();

        //создание звуковоспроизводящего устройства, название которого "виниловая вертушка", и которое будет принмать пластинки
        MusicalDevice musicalDevice2 = new MusicalDevice("виниловая вертушка", "пластинка");

        //установка поастинки в виниловую вертушку
        musicalDevice2.setMedia(media2);

        //воспроизведение песен на виниловой вертушке
        musicalDevice2.play();
        musicalDevice2.play();
        musicalDevice2.play();
    }
}
