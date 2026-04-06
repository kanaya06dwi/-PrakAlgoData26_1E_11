package P6;

public class DataDosen11 {
    Dosen11[] dataDosen = new Dosen11[10];
    int idx;
    void tambah(Dosen11 d){
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
 }
    void sortingASC(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (dataDosen[j].usia < dataDosen[j-1].usia) {
                    Dosen11 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
   }
}
    void sortingDESC(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (dataDosen[j].usia > dataDosen[j-1].usia) {
                    Dosen11 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
    }
     }
        }
    }
}
