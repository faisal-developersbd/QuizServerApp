/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sk Faisal
 */
public class FireBase {
    Firestore db;
    public FireBase() {
        
FileInputStream serviceAccount =
        null;
        try {
            serviceAccount = new FileInputStream("quizappserver-b8919-firebase-adminsdk-5ktll-c110ef08fb.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://quizappserver-b8919.firebaseio.com")
                    .build(); FirebaseApp.initializeApp(options);
                    System.out.println("Connection Established!");
                    db=FirestoreClient.getFirestore();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FireBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FireBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                serviceAccount.close();
            } catch (IOException ex) {
                Logger.getLogger(FireBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
   
    public void insertData(String tablename,Map<String,String> data)
    {
        
        try {
            ApiFuture<DocumentReference> future=  db.collection(tablename).add(data);
            System.out.println("Update time : " + future.get().getId());
        } catch (InterruptedException ex) {
            Logger.getLogger(FireBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(FireBase.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
    
   
    
}
