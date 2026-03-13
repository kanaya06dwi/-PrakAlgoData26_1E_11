package P5;

public class Nilai {
    int maxUts(Mahasiswa arr[], int l, int r){
        if(l == r){
            return arr[l].uts11;
        }
        int mid = (l + r) / 2;

        int lmax = maxUts(arr, l, mid);
        int rmax = maxUts(arr, mid+1, r);
        return Math.max(lmax, rmax);
    }
    int minUts(Mahasiswa arr[], int l, int r){
        if(l == r){
            return arr[l].uts11;
        }
        int mid = (l + r) /2;
        int lmin = minUts(arr, l, mid);
        int rmin = minUts(arr, mid+1, r);
        return Math.min(lmin, rmin);
    }
    double rataUas(Mahasiswa arr[]){
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas11;
        }
        return total/arr.length;
    }
}
