package music_library_package;

import javax.swing.JOptionPane;

public class MusicClassMain
   {

      public static void main(String[] args)
         {
            
            String artist, title, genre, question;
            char charQuestion;
            boolean status;
            
            LinkedListClass list = new LinkedListClass();
            
            do
               {
                  
                  status = false;
                  
                  question = JOptionPane.showInputDialog( "Would you like to "
                        + "add an entry for your favorite band/artist?" );
                  charQuestion = question.charAt(0);
                  
                  if( charQuestion == 'y' )
                     {
                        
                        status = true;
                        
                        artist = JOptionPane.showInputDialog("Enter band/artist");
                        title = JOptionPane.showInputDialog("Enter title");
                        genre = JOptionPane.showInputDialog("Enter genre");
                        
                        MusicClass entry = new MusicClass( artist, title, genre );
                        
                        list.appendData( entry ); 
                        
                     }
                  
               }
            while( status );
            
            //Test for insertAtHead method
            MusicClass entry2 = new MusicClass( "Odesza", "Bloom", "EDM" );
            
            list.insertAtHead( entry2 );
            
            list.displayList();

         }

   }
