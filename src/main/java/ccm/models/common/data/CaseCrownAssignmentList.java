package ccm.models.common.data;

import java.util.List;
import java.util.ArrayList;
import ccm.models.system.justin.JustinCrownAssignmentList;
import ccm.models.system.justin.JustinCrownAssignmentData;

public class CaseCrownAssignmentList {
  public static final String DASH_STRING = " - ";
  public static final String SEMICOLON_STRING = "; ";
  public static final String COMMA_STRING = ", ";
  public static final String ASSIGNMENT_TYPE_LST = "LST";

  private String mdoc_justin_no;
  private String legalStaffAssignmentList;
  private String crownAssignmentList;
  private String crownAssignmentName;

  private List<CaseCrownAssignmentData> crown_assignment;

  public CaseCrownAssignmentList() {
  }

  public CaseCrownAssignmentList(JustinCrownAssignmentList jasl) {
    setMdoc_justin_no(jasl.getMdoc_justin_no());


    List<CaseCrownAssignmentData> appearanceList = new ArrayList<CaseCrownAssignmentData>();
    
    StringBuilder legalStaffAssignments = new StringBuilder();
    StringBuilder crownAssignments = new StringBuilder();
    StringBuilder crownAssignmentName = new StringBuilder();

    if(jasl.getCrown_assignment() != null) {
      for (JustinCrownAssignmentData jas : jasl.getCrown_assignment()) {
        CaseCrownAssignmentData bcas = new CaseCrownAssignmentData(jas);
        appearanceList.add(bcas);

        if(jas.getAssign_type_code() != null) {

        }

        /*
        Legal Staff Name and Assignment List: For every crown assignment If($MAPID45="LST" then "$MAPID44 - $MAPID45")	Jones, Keith - LST; Smith, John - LST
        Crown Name and Assignment List: For every crown assignment If($MAPID45!="LST" then "$MAPID44 - $MAPID45")	Rhodes, Matt - AHR; Brown, James - B
        */
        if(ASSIGNMENT_TYPE_LST.equals(jas.getAssign_type_code())) {
          if(legalStaffAssignments.length() > 0) {
            legalStaffAssignments.append(SEMICOLON_STRING);
          }
          legalStaffAssignments.append(jas.getCrown_staff_name());
          legalStaffAssignments.append(DASH_STRING);
          legalStaffAssignments.append(jas.getAssign_type_code());
        }
        else {
          if(crownAssignments.length() > 0) {
            crownAssignments.append(SEMICOLON_STRING);
            crownAssignmentName.append(SEMICOLON_STRING);
          }
          crownAssignments.append(jas.getCrown_staff_name());
          crownAssignments.append(DASH_STRING);
          crownAssignments.append(jas.getAssign_type_code());
          // need to split name by comma and put first name, then surname
          if(jas.getCrown_staff_name() != null) {
            String[] name = jas.getCrown_staff_name().split(COMMA_STRING);
            if(name.length>1) {
              crownAssignmentName.append(name[1]);
              crownAssignmentName.append(" ");
            }
            crownAssignmentName.append(name[0]);
          }
          //crownAssignmentName.append(jas.getCrown_staff_name());
        }

      }
    }

    setCrown_assignment(appearanceList);
    setCrownAssignmentList(crownAssignments.toString());
    setCrownAssignmentName(crownAssignmentName.toString());
    setLegalStaffAssignmentList(legalStaffAssignments.toString());
  }



  public String getMdoc_justin_no() {
    return mdoc_justin_no;
  }
  public void setMdoc_justin_no(String mdoc_justin_no) {
    this.mdoc_justin_no = mdoc_justin_no;
  }
  public String getLegalStaffAssignmentList() {
    return legalStaffAssignmentList;
  }

  public void setLegalStaffAssignmentList(String legalStaffAssignmentList) {
    this.legalStaffAssignmentList = legalStaffAssignmentList;
  }

  public String getCrownAssignmentList() {
    return crownAssignmentList;
  }

  public void setCrownAssignmentList(String crownAssignmentList) {
    this.crownAssignmentList = crownAssignmentList;
  }

  public String getCrownAssignmentName() {
    return crownAssignmentName;
  }

  public void setCrownAssignmentName(String crownAssignmentName) {
    this.crownAssignmentName = crownAssignmentName;
  }

  public List<CaseCrownAssignmentData> getCrown_assignment() {
    return crown_assignment;
  }
  public void setCrown_assignment(List<CaseCrownAssignmentData> crown_assignment) {
    this.crown_assignment = crown_assignment;
  }

}