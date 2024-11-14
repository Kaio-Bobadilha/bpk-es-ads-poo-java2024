package Collections.EX4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaylistMusical {
    private List<String> playlist = new ArrayList<>();

    public void adicionarMusica(String musica) {
        playlist.add(musica);
    }

    public void removerMusica(String musica) {
        playlist.remove(musica);
    }

    public void embaralharPlaylist() {
        Collections.shuffle(playlist);
    }

    public void exibirPlaylist() {
        System.out.println("Playlist atual:");
        for (String musica : playlist) {
            System.out.println(musica);
        }
    }

    public static void main(String[] args) {
        PlaylistMusical playlist = new PlaylistMusical();
        playlist.adicionarMusica("Música 1");
        playlist.adicionarMusica("Música 2");
        playlist.adicionarMusica("Música 3");

        playlist.exibirPlaylist();
        playlist.embaralharPlaylist();
        System.out.println("\nPlaylist embaralhada:");
        playlist.exibirPlaylist();
    }
}
