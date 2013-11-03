package com.apcompsci.Band;

public class Band
{
    //1.Class Variables    
    private String nameOfBand;
    private String[] members;
    private String genreOfBand;
    private int numberOfMembers;
    private String nameOfMembers;
    private int numberOfSongs;
    private int numberOfAlbums;
    private boolean isActive;
    
    
    
    //2. Constructors
    public Band(String name)
    {
        nameOfBand = name;
    }
    
    public Band(String name, String genre, int numMem, int numSongs, int numAlbs, boolean isActive)
    {
        
    }
    
    
    
    
    //3. Methods
    
    //setters
    public void setName(String newName)
    {
        nameOfBand = newName;
    }
    
    public void setGenre(String s)
    {
        genreOfBand = s;
    }
    
    public void setNumberOfMembers(int num)
    {
        numberOfMembers = num;
    }
    public void setnameOfMembers(String memberName){
    	nameOfMembers = memberName;
    }
    
    //...

    //getters
    public String getName()
    {
        return nameOfBand;
    }
    public String getGenre(){
    	return genreOfBand;
    }

	public boolean contains(String nameOfBand2) {
		// TODO Auto-generated method stub
		return false;
	}
    
    //...
}