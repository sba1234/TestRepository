//sample program to display songs by using Array
package com.array3;

public class PlayList {
	public static void listening(Songs[] playlist)
	{
		for(int i=0;i<playlist.length;i++)
		{
			System.out.println(playlist[i].title);
			System.out.println(playlist[i].duration);
			System.out.println(playlist[i].singer);
			System.out.println("___________________");
		}
	}
			
	
	public static void main(String[] args) 
	{
	Songs[] playlist =new Songs[7];
	playlist[0]=new Songs("Teri-Meri",4.0,"Rahat Fateh Ali");
	playlist[1]=new Songs("Tagru",4.0,"Anthony Dassan");
	playlist[2]=new Songs("Nanaku Prematho",3.0,"DSP");
	playlist[3]=new Songs("Malhari",4.5,"yesudass");
	playlist[4]=new Songs("Vandemataram",5.0,"A.R. Rehman");
	playlist[5]=new Songs("Ankhya ka kajal",3,">>>>>>");
	playlist[6]=new Songs("Senorita",12,"Shawn mendes");
	listening(playlist);
	}
}

