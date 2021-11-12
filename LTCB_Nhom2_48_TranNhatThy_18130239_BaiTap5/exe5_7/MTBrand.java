/**
 * 
 */
package exe5.exe5_7;

/**
 * @author nhatthy
 *
 */
public class MTBrand implements IBrand {
	public MTBrand() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof MTBrand))
			return false;
		return true;
	}

}
