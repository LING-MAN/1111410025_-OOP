package StarWar_1111410025;
import java.util.*;
public class XWing {

	private String Shield;
	private Double ShieldPower;
	public String getShield() {
		return Shield;
	}
	public void setShield(String shield) {
		Shield = shield;
	}
	public Double getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(Double shieldPower) {
		ShieldPower = shieldPower;
	}
	public XWing(String Shield,Double ShieldPower) {
	     this.setShield(Shield);
	     this.setShieldPower(ShieldPower);
	}
	

}
