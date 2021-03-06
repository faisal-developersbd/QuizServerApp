/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.EventListener;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreException;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.common.collect.HashBiMap;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.internal.FirebaseAppStore;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Questions;
import model.Schedule;
import org.apache.poi.EncryptedDocumentException;
/**
 *
 * @author Sk Faisal
 */
public class MainForm extends javax.swing.JFrame {
    FireBase fbase;
    List questions;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        fbase=new FireBase();
        loadQuestions();
        questions=new ArrayList<Questions>();
     
    }
public void loadQuestionBox()
{
     Object[] columns={"SN","QUESTION TITLE","DAY","TIME","MAX LIFE"};
    
   

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        monitorTable = new javax.swing.JTable();
        questionBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("UPLOAD QUESTION FILE"));

        jLabel1.setText("FILE PATH");

        jButton1.setText("SELECT FILE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPLOAD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("FILE NAME");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("RECORDS"));

        questionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SN", "QUESTION TITLE", "DATE ", "TIME", "MAX LIFE", "AMOUNT"
            }
        ));
        questionTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        questionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(questionTable);

        jButton3.setText("SEARCH");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("QUESTION MANAGE", jPanel1);

        monitorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(monitorTable);

        jLabel3.setText("SELECT QUESTION");

        jButton5.setText("GET DATA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(questionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SYSTEM MONITOR", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);
         if (returnValue == JFileChooser.APPROVE_OPTION) {
         //   try {
                File selectedFile = jfc.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath().toString();
                jLabel1.setText(filePath);
                jLabel2.setText(selectedFile.getName());
//            System.out.println(selectedFile.getAbsolutePath());
//            InputStream serviceAccount = new FileInputStream("lict-6c37e-firebase-adminsdk-y0zlq-50d30c1ade.json");
//            GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
//
//            FirebaseOptions options = new FirebaseOptions.Builder()
//                    .setCredentials(credentials)
//                    .build();
//            FirebaseApp.initializeApp(options);
//
//            Firestore db = FirestoreClient.getFirestore();

//        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();

         }
        // int returnValue = jfc.showSaveDialog(null);

    }//GEN-LAST:event_jButton1ActionPerformed
ArrayList<Schedule> scheduleList=new ArrayList<>();
    public void loadQuestions()
{
 
    
   
   Firestore db;
   db=FirestoreClient.getFirestore();
   db.collection("schedule")
           .addSnapshotListener(new EventListener<QuerySnapshot>() {
       @Override
       public void onEvent(QuerySnapshot t, FirestoreException fe) {
          // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          DefaultTableModel model=(DefaultTableModel) questionTable.getModel();
         model.setRowCount(0);
           List<QueryDocumentSnapshot> listDoc=t.getDocuments();
          
       for(QueryDocumentSnapshot doc:listDoc)
       {
           Schedule qmodel=new Schedule();
           qmodel=doc.toObject(Schedule.class);
           qmodel.setId(doc.getId());
           Object[] obj={qmodel.getId(),qmodel.getTitle(),qmodel.getDate(),""+qmodel.getStart_time()+"-"+qmodel.getEnd_time(),qmodel.getMax_life(),qmodel.getAmount()};
          model.addRow(obj);
           scheduleList.add(qmodel);
           questionBox.addItem(""+qmodel.getTitle());
       }
       }
   });
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            
        Workbook workbook = WorkbookFactory.create(new File(jLabel1.getText().toString()).getAbsoluteFile());

System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");


 Sheet sheet = workbook.getSheetAt(0);
   System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
      int j=0;
      String title="";
    Iterator<Row> rowIterator = sheet.rowIterator();
            int count =1;
             while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                if(count != 1){

//            count++;
                    Iterator<Cell> cellIterator = row.cellIterator();
                    ArrayList<String> data = new ArrayList<>();
                }
                 // Create a DataFormatter to format and get each cell's value as String
            DataFormatter dataFormatter = new DataFormatter();
                 Iterator<Cell> cellIterator = row.cellIterator();
                    ArrayList<String> data = new ArrayList<>();
                 
                 while (cellIterator.hasNext() ) {

                        Cell cell = cellIterator.next();
                        int idx = cell.getColumnIndex();
                        String cellValue = dataFormatter.formatCellValue(cell);
                      //  System.out.println(""+cellValue);
                        data.add(cellValue.toString());
                        //String cellValue = dataFormatter.formatCellValue(cell);

                      //  data.add(cellValue.toString());
                    }
                 System.out.println("================================ "+j);
                 
                 Map<String, String> datas = new HashMap<>();
                  if(j==1)
                  {
                     
                     title=""+data.get(0);
                    String upload_time=data.get(1);
                     String upload_amount=data.get(2);
                    String max_life=data.get(3);
                     
                    System.out.println("Start time: "+title);
                    System.out.println("upload time: "+upload_time);
                     System.out.println("upload amount: "+upload_amount);
                      System.out.println("max_life: "+max_life);
                      Map<String,String> schedule=new HashMap<>();
                      schedule.put("title", title);
                      schedule.put("time", upload_time);
                      schedule.put("amount", upload_amount);
                      schedule.put("max_life", max_life);
                      
                       
                       
                      fbase.insertData("schedule", schedule);
                  }
                 if(j>2){
                    
                        //System.out.println("No of Column: " + data.size());
                       // CollectionReference docRef = db.collection("batch_status");
                        //System.out.println(docRef.getId());
                        // Add document data  with id "alovelace" using a hashmap
                         datas.put("title",title);
                        datas.put("q", data.get(0));
                        datas.put("o1", data.get(1));
                        datas.put("o2", data.get(2));
                        datas.put("o3", data.get(3));
                        
                        datas.put("ans", data.get(4));
                      
                       
                       

                        //asynchronously write data
                       // ApiFuture<DocumentReference> result = docRef.add(datas);
                        // ...
                        // result.get() blocks on response
//                System.out.println("Update time : " + result.get().getUpdateTime());
                        for(Map.Entry mp:datas.entrySet())
                        {
                            System.out.println(""+mp.getKey()+": "+mp.getValue());
                        }
                        fbase.insertData("questions", datas);
                       // Map<String,String> hitMap=new HashMap();
                       // hitMap.put("q",data.get(0));
                       // fbase.insertData(data.get(0),hitMap);
                        data.clear();
                    }
                 j++;
                  
            }
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidFormatException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EncryptedDocumentException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       jLabel1.setText("FILE PATH");
       jLabel2.setText("FILE NAME");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void questionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionTableMouseClicked
        // TODO add your handling code here:
        String quesTitle=""+questionTable.getValueAt(questionTable.getSelectedRow(),1);
        System.out.println("Title: "+quesTitle);
       int i= JOptionPane.showConfirmDialog(null,"Yes=Delete\nNo=View Details","Choose Option",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
       if(i==JOptionPane.NO_OPTION){
           GoToQuestionDetails(quesTitle);
           this.setVisible(false);
       }
       if(i==JOptionPane.YES_OPTION){
       
deleteQuestion(""+questionTable.getValueAt(questionTable.getSelectedRow(),0), quesTitle);
       }
       
    }//GEN-LAST:event_questionTableMouseClicked
public void getQuestionHeaders(String title)
{
        try {
            Firestore db=FirestoreClient.getFirestore();
            CollectionReference collectionReference=db.collection("questions");
            Query query = collectionReference.whereEqualTo("title",title);
// retrieve  query results asynchronously using query.get()
ApiFuture<QuerySnapshot> querySnapshot = query.get();
List<QueryDocumentSnapshot> qlist=querySnapshot.get().getDocuments();
Object[] objlist=new Object[qlist.size()];
DefaultTableModel tmodel=(DefaultTableModel) monitorTable.getModel();
tmodel.setColumnCount(qlist.size());

int count=0;
    for (DocumentSnapshot document : qlist) {
        Questions ques=document.toObject(Questions.class);
        System.out.println(document.getId());
        objlist[count]=""+ques.getQ();
        count++;
    }    
    tmodel.setColumnIdentifiers(objlist);
  
        } catch (InterruptedException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void questionStatusUpdate()
{
    
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       int pos= questionBox.getSelectedIndex();
        System.out.println("Question ID: "+scheduleList.get(pos));
        getQuestionHeaders(scheduleList.get(pos).getTitle());
        
    }//GEN-LAST:event_jButton5ActionPerformed
public void deleteQuestion(String idString,String title)
{
    Firestore db=FirestoreClient.getFirestore();
   ApiFuture<WriteResult> writeResult = db.collection("schedule").document(idString).delete();
     CollectionReference ques= db.collection("questions");
    Query query=ques.whereEqualTo("title", title);
     query.addSnapshotListener(new EventListener<QuerySnapshot>() {
        @Override
        public void onEvent(QuerySnapshot t, FirestoreException fe) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           List<QueryDocumentSnapshot> listDoc=t.getDocuments();
           for(QueryDocumentSnapshot q:listDoc)
           {
               String id=q.getId();
              // db.collection("questions").document(id).delete();
               ApiFuture<WriteResult> writeResult = db.collection("questions").document(id).delete();
               try {
                   System.out.println("delete time: "+writeResult.get().getUpdateTime());
               } catch (InterruptedException ex) {
                   Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ExecutionException ex) {
                   Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        }
    });
    
}

    public void GoToQuestionDetails(String title)
{
    Firestore db=FirestoreClient.getFirestore();
    CollectionReference liveSession=db.collection("liveuser");
    Map<String,String> mUser=new HashMap<>();
    ApiFuture<DocumentReference> fut= liveSession.add(mUser);
        try {
            System.out.println("Time: "+fut.get().getId());
        } catch (InterruptedException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    CollectionReference ques= db.collection("questions");
    Query query=ques.whereEqualTo("title", title);
    query.addSnapshotListener(new EventListener<QuerySnapshot>() {
        @Override
        public void onEvent(QuerySnapshot t, FirestoreException fe) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           System.out.println("Query Event!"); 
           List<QueryDocumentSnapshot> doc=t.getDocuments();
            QuestionDetails form=new QuestionDetails(doc);
            form.setQuestionList(doc);
            form.setVisible(true);
            
        }
    });
          
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable monitorTable;
    private javax.swing.JComboBox<String> questionBox;
    private javax.swing.JTable questionTable;
    // End of variables declaration//GEN-END:variables
}
