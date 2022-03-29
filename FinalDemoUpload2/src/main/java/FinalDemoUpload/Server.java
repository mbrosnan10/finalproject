
package FinalDemoUpload;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public abstract class Server extends TimerTask {
  private long timeStamp;
  private File file;
  List<Weather> list ;

  public Server( File file) {
  this.file = file;
  this.timeStamp = file.lastModified();

}

public  void run() {
         String line = null;
  long timeStamp = file.lastModified();

  if( this.timeStamp != timeStamp ) {
    this.timeStamp = timeStamp;
    onChange(file);
  }
}

protected abstract void onChange( File file );
}