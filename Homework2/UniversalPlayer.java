package Homework2;

public class UniversalPlayer extends MusicalDevice{
    UniversalPlayer(){
        super("Универсальный плеер");
    }

    public void play(int numberOfMusic) {
        setNumberOfMusic(numberOfMusic - 1);
        if (getNumberOfMusic() >= getMedia().getIndexOfLastSong()){
            System.out.println("Номера такой песни не существует.");
            setNumberOfMusic(0);
        }
        else
            play();
    }

    public void play() {
        if (getMedia() instanceof FlashMedia) {
            System.out.println("Сейчас играет: " + getMedia().getSong(getNumberOfMusic()));
            setNumberOfMusic(getNumberOfMusic() + 1);
            if (getNumberOfMusic() >= getMedia().getIndexOfLastSong())
                setNumberOfMusic(0);
        } else {
            setNumberOfMusic(0);
            System.out.println("Не удается воспроизвести песню на данном носителе. Поменяйте носитель или устройство для воспроизведения.");
        }
    }
}
