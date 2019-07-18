
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class MainFrame extends javax.swing.JFrame implements KeyListener {
    private LinkedList<JLabel> list=new LinkedList<JLabel>();
    private Random random=new Random();
    private static boolean check_new=false;
    public MainFrame() {
        initComponents();
        screencenter();
        seticon();
        fillscreen();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_score = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2048 !");
        setResizable(false);

        panel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("SCORE  :");

        lbl_score.setFont(new java.awt.Font("Garamond", 1, 46)); // NOI18N
        lbl_score.setForeground(new java.awt.Color(255, 255, 255));
        lbl_score.setText("0");

        lbl_author.setFont(new java.awt.Font("Lucida Handwriting", 1, 10)); // NOI18N
        lbl_author.setForeground(new java.awt.Color(255, 204, 204));
        lbl_author.setText("Made By OmerYolat");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_score, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_author, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_score, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                .addComponent(lbl_author)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    private void seticon(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("star-with-number-two.png")));
    }    
    public void screencenter(){
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(500,550);
        this.setLocation((int)((d.getWidth()/2)-(this.getWidth()/2)),(int)((d.getHeight()/2)-(this.getHeight()/2)));
    }
    private void checkfont(){
        for (JLabel a:list) {
            int length=a.getText().length();
            switch(length){
                case 1:a.setFont(new Font("Verdana", 1, 48));
                a.setForeground(Color.cyan);
                break;
                case 2:a.setFont(new Font("Verdana", 1, 36));
                a.setForeground(Color.green);
                break;
                case 3:a.setFont(new Font("Verdana", 1, 24));
                a.setForeground(Color.yellow);
                break;
                case 4:a.setFont(new Font("Verdana", 1, 20));
                a.setForeground(Color.black);
                break;
                case 5:a.setFont(new Font("Verdana", 1, 16));
                a.setForeground(Color.pink);
                break;
                case 6:a.setFont(new Font("Verdana", 1, 12));
                a.setForeground(Color.red);
                break;
                default:a.setFont(new Font("Verdana", 1,8));
                a.setForeground(Color.blue);
                break;
           }
        }
    }
    private void fillscreen(){    
        for (int x = 50; x < 436; x+=65) {
            for (int y = 100; y < 486; y+=65) {
                JLabel label=new JLabel();
                label.setForeground(Color.cyan);
                label.setHorizontalAlignment(0);
                label.setBounds(x, y, 60,60);
                label.setFont(new Font("Verdana", 1, 48));
                label.setOpaque(true);
                label.setBackground(Color.LIGHT_GRAY);
                list.add(label);
                panel.add(label);
            }
        }  
        for (int i = 0; i < 3; i++) {     
            int a=random.nextInt(list.size());     
            list.get(a).setText("2");        
        }
        this.addKeyListener(this);
    }
    private boolean checkfinish(){
        boolean check_screen=true;
        for (JLabel a:list) {
            if (a.getText().equals("")) {
                check_screen=false;
            }
        }
        return check_screen;
    }
    private void reset(){
        lbl_score.setText("0");
        list.clear();
        check_new=false;
        fillscreen();
    }
    private void newlabel(){
        boolean check=true;
        while(check){
            int x=random.nextInt(list.size());
            if (list.get(x).getText().equals("")) {
                list.get(x).setText("2");
                check=false;
            }
        }
    }
    private void up(int start,int finish){
                for (int i = start; i > finish; i--) {
                    if (list.get(i-1).getText().equals("")) {
                        list.get(i-1).setText(list.get(i).getText());
                        list.get(i).setText("");
                        check_new=true;
                    }
                    else if (list.get(i-1).getText().equals(list.get(i).getText())){
                        int x=(Integer.valueOf(list.get(i-1).getText()))*2;
                        lbl_score.setText(String.valueOf(Integer.valueOf(lbl_score.getText())+x));
                        list.get(i-1).setText(Integer.toString(x));
                        list.get(i).setText("");
                        up(start,finish);
                    }
                }    
    }
    private void down(int start,int finish){
                for (int i = start; i < finish; i++) {
                    if (list.get(i+1).getText().equals("")) {
                        list.get(i+1).setText(list.get(i).getText());
                        list.get(i).setText("");
                        check_new=true;
                    }
                    else if (list.get(i+1).getText().equals(list.get(i).getText())){
                        int x=(Integer.valueOf(list.get(i+1).getText()))*2;
                        lbl_score.setText(String.valueOf(Integer.valueOf(lbl_score.getText())+x));
                        list.get(i+1).setText(Integer.toString(x));
                        list.get(i).setText("");
                        down(start,finish);
                    }
                }    
    }
    private void right(int start,int finish){
                for (int i = start; i < finish; i+=6) {
                    if (list.get(i+6).getText().equals("")) {
                        list.get(i+6).setText(list.get(i).getText());
                        list.get(i).setText("");
                        check_new=true;
                    }
                    else if (list.get(i+6).getText().equals(list.get(i).getText())){
                        int x=(Integer.valueOf(list.get(i+6).getText()))*2;
                        lbl_score.setText(String.valueOf(Integer.valueOf(lbl_score.getText())+x));
                        list.get(i+6).setText(Integer.toString(x));
                        list.get(i).setText("");
                        right(start,finish);
                    }
                }    
    }
    private void left(int start,int finish){
                for (int i = start; i > finish; i-=6) {
                    if (list.get(i-6).getText().equals("")) {
                        list.get(i-6).setText(list.get(i).getText());
                        list.get(i).setText("");
                        check_new=true;
                    }
                    else if (list.get(i-6).getText().equals(list.get(i).getText())){
                        int x=(Integer.valueOf(list.get(i-6).getText()))*2;
                        lbl_score.setText(String.valueOf(Integer.valueOf(lbl_score.getText())+x));
                        list.get(i-6).setText(Integer.toString(x));
                        list.get(i).setText("");
                        left(start,finish);
                    }
                }    
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_score;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        check_new=false;
        //YUKARI MOVE
        if (code==KeyEvent.VK_UP) {
            //ilk sıra
                up(5,0);
            //ikinci sıra
                up(11,6);
            //üçüncü sıra
                up(17,12);
            //dördüncü sıra
                up(23,18);
            //beşinci sıra
                up(29,24);
            //altıncı sıra
                up(35,30);     
            //yeni sayı oluşturma
            checkfont();    
        }
        //AŞŞAĞI MOVE
        if (code==KeyEvent.VK_DOWN) {
            //ilk sıra
                down(0,5);
            //ikinci sıra
                down(6,11);
            //üçüncü sıra
                down(12,17);
            //dördüncü sıra
                down(18,23);
            //beşinci sıra
                down(24,29);
            //altıncı sıra
                down(30,35);     
            //yeni sayı oluşturma
            checkfont();    
        }
        //SAĞA MOVE
         if (code==KeyEvent.VK_RIGHT) {
            //ilk sıra
                right(0,25);
            //ikinci sıra
                right(1,26);
            //üçüncü sıra
                right(2,27);
            //dördüncü sıra
                right(3,28);
            //beşinci sıra
                right(4,29);
            //altıncı sıra
                right(5,30);     
            //yeni sayı oluşturma
            checkfont();    
        }       
        //SOLA MOVE
        if (code==KeyEvent.VK_LEFT) {
            //ilk sıra
                left(30,5);
            //ikinci sıra
                left(31,6);
            //üçüncü sıra
                left(32,7);
            //dördüncü sıra
                left(33,8);
            //beşinci sıra
                left(34,9);
            //altıncı sıra
                left(35,10);     
            //yeni sayı oluşturma
            checkfont();    
        }        
        if (check_new) {
            newlabel();
            checkfont();   
        }
        if (checkfinish()) {
            JOptionPane.showMessageDialog(this,"You Lose The Game ! Score :"+lbl_score.getText(),
                    "2048",JOptionPane.WARNING_MESSAGE);
            reset();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
