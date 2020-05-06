package music_library_package;

public class MusicClass
   {
      
      public String artist, title, genre;
      
      public MusicClass next;
      
      public MusicClass( String inArtist, String inTitle, String inGenre )
      {
         
         artist = inArtist;
         title = inTitle;
         genre = inGenre;
         
         next = null;
         
      }
      
      public MusicClass( MusicClass copied )
      {
         this( copied.artist, copied.title, copied.genre );
      }
      
      public String toString()
      {
         return artist + "/" + title + "/" + genre;
      }

   }
