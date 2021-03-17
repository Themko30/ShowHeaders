package Model;

import java.util.ArrayList;
import java.util.List;

public class HeadersBean {
  private List<String> headerNames;
  private List<String> headerValues;

  public HeadersBean(ArrayList<String> headerNames, ArrayList<String> headerValues) {
    this.headerNames = headerNames;
    this.headerValues = headerValues;
  }

  public List<String> getHeaderNames() {
    return headerNames;
  }

  public void setHeaderNames(List<String> headerNames) {
    this.headerNames = headerNames;
  }

  public List<String> getHeaderValues() {
    return headerValues;
  }

  public void setHeaderValues(List<String> headerValues) {
    this.headerValues = headerValues;
  }
}
