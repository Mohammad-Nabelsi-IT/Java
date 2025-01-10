public class Like implements Likeable {
    private int likeId;

    public Like(int likeId) {
        this.likeId = likeId;
    }

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    @Override
    public String toString() {
        return
                "likeId=" + likeId +
                        '}';
    }

    public void like() {
        System.out.println("like");
    }
}
