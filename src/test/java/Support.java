import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Support {
    @JsonProperty("Url")
    private String Url;
    @JsonProperty("Text")
    private String Text;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    @Override
    public String toString() {
        return "\nSupport object:\nUrl:" + Url + "\nText:" + Text;
    }
}
