import java.util.Scanner;

public class StudiKasus2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
                jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = input.nextInt();

            System.out.print("Peringkat juara : ");
            int peringkatJuara = input.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Juara Harapan atau peserta tidak memperoleh dana penghargaan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = input.nextInt();

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPendanaan = input.nextInt();

            if (statusPendanaan == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tim tidak lolos pendanaan, tidak memperoleh dana penghargaan.");
            }

        } else {
            System.out.println("Status : Kegiatan di luar ketentuan, tidak memperoleh dana penghargaan.");
        }

        input.close();
    }
}