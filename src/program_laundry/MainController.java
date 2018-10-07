/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_laundry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MainController implements Initializable {

    int hasil;
    int berat3;
    String berat2;
    String hasil2;
    String bayar3;
    int bayar4;

    @FXML
    private Button info;
    @FXML
    private Button exit;
    @FXML
    private TextField tampilHarga;
    @FXML
    private TextField berat;
    @FXML
    private Button cetak;
    @FXML
    private TextArea akhir;
    @FXML
    private Button hitung;
    @FXML
    private TextField nama;
    @FXML
    private TextField jenis;
    @FXML
    private TextField bayar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void informasi(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "===Informasi Harga Laundry===" + "\n" + "Cuci Biasa : Rp3000" + "\n"
                + "Cuci Kering : Rp3500" + "\n" + "Cuci Setrika : Rp4000" + "\n" + "Terima Kasih");
    }

    @FXML
    private void keluar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void print(ActionEvent event) {
        String nama2 = nama.getText();
        String jenis2 = jenis.getText();
        String bayar2 = bayar.getText();
        String brt = berat.getText();

        bayar3 = bayar.getText();
        bayar4 = Integer.parseInt(bayar3);
        if (bayar4 < hasil) {
            int bayar5 = hasil - bayar4;
            akhir.setText("Nama : " + nama2 + "\n" + "Jenis Laundry : " + jenis2
                    + "\n" + "Berat Laundry (kg) : " + brt + "\n" + "Harga Total : " + hasil2 + "\n" + "Bayar : " + bayar4 + "\n"
                    + "Uang anda kurang : " + bayar5);
        } else if (bayar4 == hasil) {
            akhir.setText("Nama : " + nama2 + "\n" + "Jenis Laundry : " + jenis2
                    + "\n" + "Berat Laundry (kg) : " + brt + "\n" + "Harga Total : " + hasil2 + "\n" + "Bayar : " + bayar4 + "\n"
                    + "Uang anda pas");
        } else if (bayar4 > hasil) {
            int bayar6 = bayar4 - hasil;
            akhir.setText("Nama : " + nama2 + "\n" + "Jenis Laundry : " + jenis2
                    + "\n" + "Berat Laundry (kg) : " + brt + "\n" + "Harga Total : " + hasil2 + "\n" + "Bayar : " + bayar4 + "\n"
                    + "Kembalian uang anda : " + bayar6);
        }
    }

    @FXML
    private void hitungan(ActionEvent event) {
        String pilih = jenis.getText();
        switch (pilih) {
            case "Cuci Biasa":
                berat2 = berat.getText();
                berat3 = Integer.parseInt(berat2);
                hasil = berat3 * 3000;
                hasil2 = String.valueOf(hasil);
                tampilHarga.setText(hasil2);
                break;
            case "Cuci Kering":
                berat2 = berat.getText();
                berat3 = Integer.parseInt(berat2);
                hasil = berat3 * 3500;
                hasil2 = String.valueOf(hasil);
                tampilHarga.setText(hasil2);
                break;
            case "Cuci Setrika":
                berat2 = berat.getText();
                berat3 = Integer.parseInt(berat2);
                hasil = berat3 * 4000;
                hasil2 = String.valueOf(hasil);
                tampilHarga.setText(hasil2);
        }
    }

}
