package music_library_package;

public class LinkedListClass
   {
      
      private MusicClass head;
      
      public LinkedListClass()
      {
         head = null;
      }
      
      public void appendData( MusicClass data )
      {
         head = appendDataHelper( head, data );
      }
      
      private MusicClass appendDataHelper( MusicClass node, MusicClass newData )
      {
         
         if( node != null )
            {
               
               node.next = appendDataHelper( node.next, newData );
               return node;
               
            }
         
         return new MusicClass( newData );
      }
      
      public void clearList()
      {
         head = null;
      }
      
      public void displayList()
      {
         
         if( head == null )
            {
               System.out.println("The list is empty");
            }
         
         displayListHelper( head );
         
      }
      
      private void displayListHelper( MusicClass node )
      {
         
         if( node != null )
            {
               
               System.out.println( node.toString() );
               displayListHelper( node.next );
               
            }
         
      }
      
      public void insertAtHead( MusicClass newData )
      {
         
         if( head != null )
            {
               
               MusicClass newNode = new MusicClass( newData );
               newNode.next = head;
               head = newNode;
               
            }
         
      }

   }
