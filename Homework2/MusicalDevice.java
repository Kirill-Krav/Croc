package Homework2;

import java.util.Objects;

public class MusicalDevice {

    private String nameOfDevice;
    private String nameOfSuitableMedia;
    private int numberOfMusic;
    private Media media;

    /**
     * Конструктор с параметрами
     * @param nameOfDevice - название девайса
     * @param nameOfSuitableMedia - название подходящего носителя
     */
    public MusicalDevice(String nameOfDevice, String nameOfSuitableMedia){
        this.nameOfDevice = nameOfDevice;
        this.nameOfSuitableMedia = nameOfSuitableMedia;
        this.numberOfMusic = 0;
    }

    /**
     * Метод возвращающий название девайса
     * @return nameOfDevice
     */
    public String getNameOfDevice(){
        return this.nameOfDevice;
    }

    /**
     * Метод возвращающий название подходящего носителя
     * @return nameOfSuitableMedia
     */
    public String getNameOfSuitableMedia() {
        return nameOfSuitableMedia;
    }

    /**
     * Метод возвращающий индекс песни который будет воспроизведен следующим
     * @return numberOfMusic
     */
    public int getNumberOfMusic() {
        return numberOfMusic;
    }

    /**
     * Метод возвращающий использующий носитель
     * @return media
     */
    public Media getMedia() {
        return media;
    }

    /**
     * метод записи названия девайса
     * @param nameOfDevice
     */
    public void setNameOfDevice(String nameOfDevice) {
        this.nameOfDevice = nameOfDevice;
    }

    /**
     * метод записи подходящего носителя
     * @param nameOfSuitableMedia
     */
    public void setNameOfSuitableMedia(String nameOfSuitableMedia) {
        this.nameOfSuitableMedia = nameOfSuitableMedia;
    }

    /**
     * метод записи индекса песни которая будет воспроизведена следующей
     * @param numberOfMusic
     */
    public void setNumberOfMusic(int numberOfMusic) {
        this.numberOfMusic = numberOfMusic;
    }

    /**
     * метод записи носителя
     * @param media
     */
    public void setMedia(Media media) {
        this.numberOfMusic = 0;
        this.media = media;
    }

    /**
     * метод воспроизведения кокретного порядкого номера песни
     * @param numberOfMusic
     */
    public void play(int numberOfMusic) {
        this.numberOfMusic = numberOfMusic - 1;
        if (this.numberOfMusic >= this.media.getIndexOfLastSong()){
            System.out.println("Номера такой песни не существует.");
            this.numberOfMusic = 0;
        }
        else
            play();
    }

    /**
     * Метод воспроизведения следующей песни
     */
    public void play(){
        if(this.media.getNameOfMedia() == this.nameOfSuitableMedia){
            System.out.println("Сейчас играет: " + this.media.getSong(this.numberOfMusic + 1));
            this.numberOfMusic++;
            if(this.numberOfMusic >= this.media.getIndexOfLastSong())
                this.numberOfMusic = 0;
        }
        else{
            this.numberOfMusic = 0;
            System.out.println("Не удается воспроизвести песню на данном носителе. Поменяйте носитель или устройство для воспроизведения.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MusicalDevice that = (MusicalDevice) o;
        return numberOfMusic == that.numberOfMusic && Objects.equals(nameOfDevice, that.nameOfDevice) && Objects.equals(nameOfSuitableMedia, that.nameOfSuitableMedia) && Objects.equals(media, that.media);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDevice, nameOfSuitableMedia, numberOfMusic, media);
    }

    @Override
    public String toString() {
        return "Название девайса: " + getNameOfDevice() + ", Название подходящего носителя: " + getNameOfSuitableMedia();
    }
}
