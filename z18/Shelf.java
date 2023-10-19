public class Shelf{
    private Album[] albums;
    public Shelf(Album[] albums) {
        this.albums = albums;
    }
    public Album[] getAlbums() {
        return albums;
    }
    public String findAlbumBySong(String title){
        for(int i = 0; i < albums.length; i++){
            Song[] arr = albums[i].getSongs();
            for(int j = 0; j<arr.length; j++){
                if(title.equals(arr[j].getTitle())) return albums[i].getTitle();
            }
        }
        return "No song with that title found on any albums!";
    }
}