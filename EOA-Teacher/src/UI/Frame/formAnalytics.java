package UI.Frame;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.BCDAO;
import static Controller.LocalData.CurrentID;
import static Controller.LocalData.Lang;
import static Controller.LocalData.ParentFrame;
import ObjectClass.BaoCao;
import ObjectClass.BuoiThi;
import com.AnLa.FILE.Log;
import com.AnLa.UI.Mode;
import com.raven.chart.ModelChart;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class formAnalytics extends javax.swing.JDialog {
    public formAnalytics(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try { setIconImage(ImageIO.read(getClass().getResource("/UI/Image/Logo.png"))); } 
        catch (IOException ex) {Log.add("!!! Error try to set Icon for frame. !!!");}
        Mode.setModeComponent(Background);      Mode.setModeComponent(icoReturn);   Mode.setModeComponent(icoArrow);
        Mode.setModeComponent(scrPan);          Mode.setModeComponent(icoReload);
        Mode.setModeComponent(scrPan.getVerticalScrollBar());
        Mode.setModeComponent(panChild);
        Chart.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        icoReturn = new com.AnLa.UI.ImagePanel();
        icoArrow = new com.AnLa.UI.ImagePanel();
        icoReload = new com.AnLa.UI.ImagePanel();
        Chart = new com.raven.chart.CurveChart();
        scrPan = new javax.swing.JScrollPane();
        panChild = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        icoReturn.setBackground(new java.awt.Color(153, 255, 255));
        icoReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icoReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icoReturnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoReturnMousePressed(evt);
            }
        });

        icoReturn.setPic("src/UI/Image/Return.png");

        javax.swing.GroupLayout icoReturnLayout = new javax.swing.GroupLayout(icoReturn);
        icoReturn.setLayout(icoReturnLayout);
        icoReturnLayout.setHorizontalGroup(
            icoReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoReturnLayout.setVerticalGroup(
            icoReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        icoArrow.setBackground(new java.awt.Color(153, 255, 255));
        icoArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoArrowMousePressed(evt);
            }
        });

        icoArrow.setPic("src/UI/Image/Down.png");

        javax.swing.GroupLayout icoArrowLayout = new javax.swing.GroupLayout(icoArrow);
        icoArrow.setLayout(icoArrowLayout);
        icoArrowLayout.setHorizontalGroup(
            icoArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoArrowLayout.setVerticalGroup(
            icoArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        icoReload.setBackground(new java.awt.Color(153, 255, 255));
        icoReload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icoReload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icoReloadMousePressed(evt);
            }
        });

        icoReload.setPic("src/UI/Image/Reload.png");

        javax.swing.GroupLayout icoReloadLayout = new javax.swing.GroupLayout(icoReload);
        icoReload.setLayout(icoReloadLayout);
        icoReloadLayout.setHorizontalGroup(
            icoReloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        icoReloadLayout.setVerticalGroup(
            icoReloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        Chart.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        scrPan.setBorder(null);
        scrPan.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrPan.setVerticalScrollBar(new com.AnLa.UI.ScrollBar());

        javax.swing.GroupLayout panChildLayout = new javax.swing.GroupLayout(panChild);
        panChild.setLayout(panChildLayout);
        panChildLayout.setHorizontalGroup(
            panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1918, Short.MAX_VALUE)
        );
        panChildLayout.setVerticalGroup(
            panChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        scrPan.setViewportView(panChild);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrPan, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(icoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(855, 855, 855)
                .addComponent(icoArrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(855, 855, 855)
                .addComponent(icoReload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Chart, javax.swing.GroupLayout.PREFERRED_SIZE, 1870, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoArrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icoReload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Chart, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrPan, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icoReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReturnMouseEntered
        icoReturn.setPic("src/UI/Image/Return2.png");
    }//GEN-LAST:event_icoReturnMouseEntered

    private void icoReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReturnMouseExited
        icoReturn.setPic("src/UI/Image/Return.png");
    }//GEN-LAST:event_icoReturnMouseExited

    private void icoReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReturnMousePressed
        dispose();
    }//GEN-LAST:event_icoReturnMousePressed

    private void icoArrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoArrowMousePressed
        showChart = !showChart;
        Chart.setVisible(showChart);
        icoArrow.setPic("src/UI/Image/"+(showChart ? "Up" : "Down")+".png");
        Chart.start();
    }//GEN-LAST:event_icoArrowMousePressed

    private void icoReloadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoReloadMousePressed
        BigLoader loader = new BigLoader(ParentFrame, true);
        loader.setInfor("/UI/Image/Circle.gif", Lang.getString("Loading"));
        loader.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void windowOpened(java.awt.event.WindowEvent evt) {
                new Thread() { @Override public void run() {
                        
                    arrBaoCao = BCDAO.selectAllById(buoithi, CurrentID);
                    fillChart();
                    
                    loader.dispose();
                }}.start();
            }});
        loader.setVisible(true);
    }//GEN-LAST:event_icoReloadMousePressed

    public static void main(String args[]) {
        System.setProperty("sun.java2d.uiScale", "1.0");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAnalytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formAnalytics dialog = new formAnalytics(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private ArrayList<BaoCao> arrBaoCao;
    private boolean showChart = false;
    private BuoiThi buoithi;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private com.raven.chart.CurveChart Chart;
    private com.AnLa.UI.ImagePanel icoArrow;
    private com.AnLa.UI.ImagePanel icoReload;
    private com.AnLa.UI.ImagePanel icoReturn;
    private javax.swing.JPanel panChild;
    private javax.swing.JScrollPane scrPan;
    // End of variables declaration//GEN-END:variables

    public void setAnalytics(ArrayList<BaoCao> arrbc, BuoiThi bt){
        this.arrBaoCao = arrbc;
        this.buoithi = bt;
        Chart.addLegend(Lang.getString("Mark"), new Color(12, 84, 175), new Color(0, 108, 247));
//        Chart.addLegend(Lang.getString("LUnde"), new Color(5, 125, 0), new Color(95, 209, 69));
//        Chart.addLegend(Lang.getString("LMani"), new Color(255, 205, 0), new Color(255, 222, 0));
        Chart.addLegend(Lang.getString("LostFocus"), new Color(186, 37, 37), new Color(241, 100, 100));
//        Chart.addLegend(Lang.getString("Mark"), new Color(153, 0, 0), new Color(229, 0, 0));
        fillChart();
    }
    private void fillChart(){
        Chart.clear();
        panChild.removeAll();
        panChild.setLayout(new javax.swing.BoxLayout(panChild, javax.swing.BoxLayout.Y_AXIS));
        for(int i = 0 ; i < arrBaoCao.size() ; i++){
            BaoCao bc = arrBaoCao.get(i);
            panStudentAnalytics pan = new panStudentAnalytics();
            pan.setAnalytics(bc);
            pan.lblSTT.setText(String.valueOf(i+1));
            Chart.addData(new ModelChart(bc.getName(), new double[]{bc.getMark(), bc.getLostFocus()}));
            panChild.add(pan);
        }
        Chart.start();
        repaint();
    }
}