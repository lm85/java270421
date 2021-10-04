
public enum Rank {
	SEDM(7)  ,
	OSM (8) ,
	DEVET (9) ,
	DESET  (10) ,
	SPODEK(1),
	SVRSEKK(1),
	KRAL (2) ,
	ESO (11);

	private int r;
	Rank(int r)	{

		this.r=r;
	}

	public int getRank(){

		return this.r;
	}

}
