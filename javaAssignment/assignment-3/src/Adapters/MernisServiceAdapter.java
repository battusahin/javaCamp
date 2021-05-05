package Adapters;

import Abstract.MemberCheckService;
import Entities.Member;
import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter implements MemberCheckService {

	@Override
	public boolean checkIfRealPerson(Member member) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId()),member.getFirstName().toUpperCase(),
					member.getLastName().toUpperCase(),member.getDateOfBirth().getYear());
			return result;
		}catch(RemoteException e){
			e.printStackTrace();
		}catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		return false;
	}
}