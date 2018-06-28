package in.co.dermatologist.dit.view;

import java.util.ResourceBundle;

public enum FxmlView {

    APP {
        @Override
		public String getTitle() {
            return getStringFromResourceBundle("app.title");
        }

        @Override
		public String getFxmlFile() {
            return "/fxml/App.fxml";
        }
    };
    
    public abstract String getTitle();
    public abstract String getFxmlFile();
    
    String getStringFromResourceBundle(String key){
        return ResourceBundle.getBundle("Bundle").getString(key);
    }

}
