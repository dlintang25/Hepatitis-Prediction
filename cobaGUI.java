import java.awt.event.*;
import javax.swing.*;

public class cobaGUI extends prosesPeluang implements ActionListener{ //Inhiretance (pewarisan dari class prosesPeluang)
    private JButton btnHasil, btnHapus;  //encapsulasi dengan hak akses priate agar hanya dapat diakses keluarga itu sendiri
    private JTextField textfield, textfieldNama, textfieldUsia, textfieldBilirubin, textfieldAlkfosfat,  textfieldSgot, textfieldAlbumin, jTFHasil, jTFHidup, jTFMati;  //encapsulasi dengan hak akses priate agar hanya dapat diakses keluarga itu sendiri
    private JLabel label;  //encapsulasi dengan hak akses priate agar hanya dapat diakses keluarga itu sendiri

    public cobaGUI(){
        super(); //inheritance (memanggir konstruktor dari class induk proses peluang)
        JFrame frame = new JFrame();
        frame.setBounds(100,100,900,600);
        frame.setTitle("HEPATITIS");
        label = new JLabel("Prediksi Harapan Hidup Penderita Hepatitis");
        label.setBounds(25,25,800,35);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        frame.add(label);

        label = new JLabel("Nama : ");
        label.setBounds(25,75,100,25);
        frame.add(label);
        textfieldNama = new JTextField();
        textfieldNama.setBounds(125,75,150,25);
        frame.add(textfieldNama);

        label = new JLabel("Usia : ");
        label.setBounds(25,125,100,25);
        frame.add(label);
        textfieldUsia = new JTextField();
        textfieldUsia.setBounds(125,125,150,25);
        frame.add(textfieldUsia);

        label = new JLabel("Kadar Bilirubin : ");
        label.setBounds(25,175,100,25);
        frame.add(label);
        textfieldBilirubin = new JTextField();
        textfieldBilirubin.setBounds(125,175,150,25);
        frame.add(textfieldBilirubin);

        label = new JLabel("Kadar Alk Fosfat : ");
        label.setBounds(300,75,125,25);
        frame.add(label);
        textfieldAlkfosfat = new JTextField();
        textfieldAlkfosfat.setBounds(400,75,150,25);
        frame.add(textfieldAlkfosfat);

        label = new JLabel("Kadar SGOT : ");
        label.setBounds(300,125,100,25);
        frame.add(label);
        textfieldSgot = new JTextField();
        textfieldSgot.setBounds(400,125,150,25);
        frame.add(textfieldSgot);

        label = new JLabel("Kadar Albumin : ");
        label.setBounds(300,175,100,25);
        frame.add(label);
        textfieldAlbumin = new JTextField();
        textfieldAlbumin.setBounds(400, 175, 150, 25);
        frame.add(textfieldAlbumin);

        btnHasil = new JButton("Cek Hasil");
        btnHasil.setBounds(400, 275, 105, 50);
        frame.add(btnHasil);
        // frame.setSize(200, 70);
        // frame.setLocation(300, 275);

        btnHapus = new JButton("Reset");
        btnHapus.setBounds(250, 275, 105, 50);
        frame.add(btnHapus);
      
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        btnHasil.addActionListener(this);
        btnHapus.addActionListener(this);

        jTFHasil = new JTextField();
        jTFHasil.setBounds(25, 375, 800, 25);
        jTFHasil.setEditable(false);
        frame.add(jTFHasil);

        jTFMati = new JTextField();
        jTFMati.setBounds(25, 425, 800, 25);
        jTFMati.setEditable(false);
        frame.add(jTFMati);

        jTFHidup = new JTextField();
        jTFHidup.setBounds(25, 475, 800, 25);
        jTFHidup.setEditable(false);
        frame.add(jTFHidup);
    }

    public void actionPerformed(ActionEvent e){ //override method actionPerformen dari interface ActionListener


        if(e.getSource()==btnHasil){
            String error= "";
            String nama = textfieldNama.getText().trim();
            double usia = 1.0;
            double bilirubin = 1.0;
            double alkFosfat = 1.0;
            double sgot = 1.0;
            double albumin=1.0;
            try {
                usia = (Double.valueOf(textfieldUsia.getText().trim()));
            } catch (NumberFormatException er) {
                textfieldUsia.setText("");
                error = "error";
            }
            try {
                bilirubin = (Double.valueOf(textfieldBilirubin.getText().trim()));
            } catch (NumberFormatException er) {
                textfieldBilirubin.setText("");
                error = "eror";
            }
            try {
                alkFosfat = (Double.valueOf(textfieldAlkfosfat.getText().trim()));
            } catch (NumberFormatException er) {
                textfieldAlkfosfat.setText("");
                error = "eror";
            }
            try {
                sgot = (Double.valueOf(textfieldSgot.getText().trim()));
            } catch (NumberFormatException er) {
                textfieldSgot.setText("");
                error = "eror";
            }
            try {
                albumin = (Double.valueOf(textfieldAlbumin.getText().trim()));
            } catch (NumberFormatException er) {
                textfieldAlbumin.setText("");
                error = "eror";
            }

            if (error==""){
                super.setPeluang(usia, bilirubin, alkFosfat, sgot, albumin);
                if (super.getPeluangHidup() > super.getPeluangMati()){
                    jTFHasil.setText("hasilnya hidup");
                    jTFHidup.setText("peluang hidup: "+super.getPeluangHidup());
                    jTFMati.setText("peluang mati: "+super.getPeluangMati());
                }
                if(super.getPeluangHidup() < super.getPeluangMati()) {
                    jTFHasil.setText("hasilnya mati");
                    jTFHidup.setText("peluang hidup: "+super.getPeluangHidup());
                    jTFMati.setText("peluang mati: "+super.getPeluangMati());
                }
                if(super.getPeluangHidup()==super.getPeluangMati()){
                    jTFHasil.setText("hasilnya tidak ditemukan");
                    jTFHidup.setText("peluang hidup: "+super.getPeluangHidup());
                    jTFMati.setText("peluang mati: "+super.getPeluangMati());
                }
            }
            

        }
        if(e.getSource()==btnHapus){
            textfieldNama.setText("");
            textfieldUsia.setText("");
            textfieldBilirubin.setText("");
            textfieldAlkfosfat.setText("");
            textfieldSgot.setText("");
            textfieldAlbumin.setText("");
            
            jTFHasil.setText("");
            jTFHidup.setText("");
            jTFMati.setText("");

        }
    }

    public static void main(String[] args) {
        cobaGUI frame = new cobaGUI();
    }
}