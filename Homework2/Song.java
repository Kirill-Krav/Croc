package Homework2;

import java.util.Objects;

public class Song {

    private String nameOfPerformer;
    private String nameOfSong;

    /**
     * конструктор по умолчанию
     */
    public Song(){
        this.nameOfPerformer = "";
        this.nameOfSong = "";
    }

    /**
     * конструктор с параметрами
     * @param nameOfPerformer - исполнитель песни
     * @param nameOfSong - название песни
     */
    public Song(String nameOfPerformer, String nameOfSong){
        this.nameOfPerformer = nameOfPerformer;
        this.nameOfSong = nameOfSong;
    }

    /**
     * Метод возвращающий имя испонителя
     * @return nameOfPerformer
     */
    public String getNameOfPerformer() {
        return nameOfPerformer;
    }

    /**
     * Метод возвращающий название песни
     * @return nameOfSong
     */
    public String getNameOfSong() {
        return nameOfSong;
    }

    /**
     * метод записи имени испонителя
     * @param nameOfPerformer
     */
    public void setNameOfPerformer(String nameOfPerformer) {
        this.nameOfPerformer = nameOfPerformer;
    }

    /**
     * метод записи названия песни
     * @param nameOfSong
     */
    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Song song = (Song) o;
        return Objects.equals(nameOfPerformer, song.nameOfPerformer) && Objects.equals(nameOfSong, song.nameOfSong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPerformer, nameOfSong);
    }

    @Override
    public String toString(){
        return "Исполнитель: " + getNameOfPerformer() + " Песня: " + getNameOfSong();
    }
}
