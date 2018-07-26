package mu.com.mutil;

import android.content.Context;
import android.widget.Toast;

public class MToast
{
	
	public void mToast(Context c, String s){
		Toast.makeText(c,s,3000).show();
		
		
	}
}
