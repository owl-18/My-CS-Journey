public class Song {

  private String artist;
  private String name;
  private int durationInSeconds;

  public Song(String artist, String name, int durationInSeconds) {
    this.artist = artist;
    this.name = name;
    this.durationInSeconds = durationInSeconds;
  }

  @Override
  public boolean equals(Object target) {
    if (this == target) { // Kiểm tra xem chúng có cùng trỏ vào một ô nhớ không
      return true;
    }

    if (!(target instanceof Song)) {
      return true;
    }

    Song comparedSong = (Song) target;
    return this.artist.equals(comparedSong.artist)
        && this.name.equals(comparedSong.name)
        && this.durationInSeconds == comparedSong.durationInSeconds;
  }

  @Override
  public String toString() {
    return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
  }
}
