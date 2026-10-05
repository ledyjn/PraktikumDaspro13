import java.util.Scanner;

public class StudiKasus2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
                jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            int peringkatJuara = input.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                        + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPendanaan = input.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                        + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (statusPendanaan == 1) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (tim tidak lolos pendanaan).");
                }
            }

        } else {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

        input.close();
    }
}