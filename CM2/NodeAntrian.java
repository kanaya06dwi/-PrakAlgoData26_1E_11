package CM2;

public class NodeAntrian {
    Pembeli data;
    NodeAntrian next;
    NodeAntrian prev;
    NodeAntrian(Pembeli data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
