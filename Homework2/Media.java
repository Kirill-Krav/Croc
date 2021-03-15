package Homework2;

import java.util.Arrays;
import java.util.Objects;

abstract public class Media {

    private String nameOfMedia;
    private int size;
    private int indexOfLastSong;
    private Song[] songs;

    /**
     * Конструктор с параметрами
     * @param nameOfMedia - название носителя
     * @param size - размер носителя
     */
    public Media(String nameOfMedia, int size){
        this.nameOfMedia = nameOfMedia;
        this.size = Math.abs(size);
        this.indexOfLastSong = 0;
        this.songs = new Song[size];
        for(int i = 0; i < size; i++)
            songs[i] = new Song();
    }

    /**
     * Метод возвращающий название носителя
     * @return nameOfMedia
     */
    public String getNameOfMedia() {
        return nameOfMedia;
    }

    /**
     * Метод возвращающий размер носителя
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * Метод возвращающий порядковый номер последней записанной песни
     * @return indexOfLastSong
     */
    public int getIndexOfLastSong() {
        return indexOfLastSong;
    }

    /**
     * Метод возвращающий массив из песен
     * @return songs
     */
    public Song[] getSongs() {
        return songs;
    }

    /**
     * Метод возвращающий песню определенного индекса
     * @param indexOfSong - номер песни
     * @return
     */
    public Song getSong(int indexOfSong){
        return songs[indexOfSong];
    }

    /**
     * метод записи названия носителя
     * @param nameOfMedia
     */
    public void setNameOfMedia(String nameOfMedia) {
        this.nameOfMedia = nameOfMedia;
    }

    /**
     * метод записи размера носителя
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * метод записи порядкового номера последней записанной песни
     * @param indexOfLastSong
     */
    public void setIndexOfLastSong(int indexOfLastSong) {
        this.indexOfLastSong = indexOfLastSong;
    }

    /**
     * метод записи массива песен
     * @param songs
     */
    public void setSong(Song[] songs) {
        this.songs = songs;
    }

    /**
     * метод записи новой песни в носитель
     * @param song
     */
    public void writeSong(Song song){
        if(this.indexOfLastSong < this.size){
            this.songs[this.indexOfLastSong] = song;
            this.indexOfLastSong++;
            System.out.println("Запись песни произошла успешно, свободного места для следующих песен осталось " + (this.size - this.indexOfLastSong) + ".\n");
        }
        else{
            System.out.println("Запись песни не получилось выполнить, осободите места на данном носителе.\n");
        }
    }

    /**
     * метод удаления определенной песни из носителя с помощью ее порядкого номера
     * @param indexOfSong
     */
    public void deleteSong(int indexOfSong){
        indexOfSong--;
        if(indexOfSong < this.indexOfLastSong){
            this.indexOfLastSong--;
            Song song = this.songs[indexOfSong];
            for(int i = indexOfSong; i < this.indexOfLastSong; i++) {
                this.songs[i] = this.songs[i + 1];
            }
            this.songs[indexOfLastSong] = new Song("", "");
            System.out.println("Удаление песни: " + song + " произошло успешно.\n");
        }
        else{
            System.out.println("Удалить песню не удалось, неверно указан номер песни.\n");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Media media = (Media) o;
        return size == media.size && indexOfLastSong == media.indexOfLastSong && Objects.equals(nameOfMedia, media.nameOfMedia) && Arrays.equals(songs, media.songs);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nameOfMedia, size, indexOfLastSong);
        result = 31 * result + Arrays.hashCode(songs);
        return result;
    }

    @Override
    public String toString() {
        return "Название носителя: " + nameOfMedia + ", размер: " + size + ", песни: " + Arrays.toString(songs);
    }
}
