public class VideoPlayerAdapter implements MediaPlayer {
    private MediaPlayer advancedPlayer;

    public VideoPlayerAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("mp4")) {
            advancedPlayer = new MP4Player();
        } else if (fileType.equalsIgnoreCase("vlc")) {
            advancedPlayer = new VLCPlayer();
        }
    }

    @Override
    public void play(String filename) {
        advancedPlayer.play(filename);
    }
}
