package herencia.CasoPractico.EjerciciosLargos;

public class VideoMp4 extends Video{

	public VideoMp4(int lenght) {
		super(lenght);
	}

	@Override
	public boolean isValid() {
		
		if (this.getLenght() < 300) {
			return true;
		} 
			return false;
		
	}
	
}
