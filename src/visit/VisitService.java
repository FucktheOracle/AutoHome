package visit;

import java.util.List;

import dao.DBOperational;

import entity.Firm;
import entity.ReturnVisitClients;

public class VisitService {
	private DBOperational dao = new DBOperational();
	//ģ����ѯ���лط���Ϣ�ķ���
	public List queryReturnVisit(String textfieldclName,String mailingTime){
		String sql = "SELECT * FROM autohome.r_c where clName like '%"+ textfieldclName + "%' and rvDate like '%"+ mailingTime + "%'";
		List list = dao.selectAll(sql, ReturnVisitClients.class);
		return list;
	}
	//ִ��ɾ���ķ���
	public void deleteReturnVisit(Integer rvID) {
		String sql = "delete from autohome.returnvisit where rvID = " + rvID;
		dao.update(sql);
	}
	
}
