package Homework2;

import java.util.Objects;

abstract public class MusicalDevice {

    private String nameOfDevice;
    private int numberOfMusic;
    private Media media;

    /**
     * Конструктор с параметрами
     * @param nameOfDevice - название девайса
     */
    public MusicalDevice(String nameOfDevice){
        this.nameOfDevice = nameOfDevice;
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
    public void play(int numberOfMusic) {}

    /**
     * Метод воспроизведения следующей песни
     */
    public void play(){}

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MusicalDevice that = (MusicalDevice) o;
        return numberOfMusic == that.numberOfMusic && Objects.equals(nameOfDevice, that.nameOfDevice) && Objects.equals(media, that.media);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDevice, numberOfMusic, media);
    }

    @Override
    public String toString() {
        return "Название девайса: " + getNameOfDevice();
    }
}
