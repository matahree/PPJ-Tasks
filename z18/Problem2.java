public class Problem2{
    public static void main (String[] args) {
        Album alb1 = new Album("Loving You",
                new Song[]{
                        new Song("Elvis","Party"),
                        new Song("Elvis","Hot Dog")
                });
        Album alb2 = new Album("Ella & Louis",
                new Song[]{
                        new Song("Armstrong","A Foggy Day"),
                        new Song("Fitzgerald","Cheek to Cheek")
                });
        Shelf shelf = new Shelf(
                new Album[]{alb1,alb2});
        System.out.println("Song from album: " +
                shelf.findAlbumBySong("Cheek to Cheek"));
    }
}