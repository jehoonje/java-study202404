package day11.song;

import java.util.Set;


// 1개의 가수 정보
public class Artist {


    private String artistName; // 가수명
    private Set<String> songList; // 노래 목록


    // 생성자
    public Artist(String artistName, Set<String> songList) {
        this.artistName = artistName;
        this.songList = songList;
    }





    // setter, getter

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    // 노래 추가 메서드
    public boolean addSong(String songName) {
        // 이미 있는 노래인지 확인
        if (songList.contains(songName)) {
            System.out.println("이미 등록된 노래입니다.");
            return false;
        } else {
            songList.add(songName);
            System.out.println(songName + "이(가) " + artistName + "의 곡으로 등록되었습니다.");
            return true;
        }
    }


    // ...


}
