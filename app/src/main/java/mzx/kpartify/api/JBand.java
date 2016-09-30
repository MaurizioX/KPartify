package mzx.kpartify.api;

import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.PropertyName;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mauricioheredia on 26/09/16.
 */
@IgnoreExtraProperties
public class JBand {
 private HashMap<String, Alias> aliases;

    public HashMap<String, Alias> getAliases() {
        return aliases;
    }

    public String getCountry() {
        return country;
    }

    public String getDisambiguation() {
        return disambiguation;
    }

    public String getId() {
        return id;
    }

    public LifeSpan getLifeSpan() {
        return lifeSpan;
    }

    public String getName() {
        return name;
    }

    public String getSortName() {
        return sortName;
    }

    public String getType() {
        return type;
    }

    private String country;
    private String disambiguation;
    private String id;
    @PropertyName("life-span")
    private LifeSpan lifeSpan;
    private String name;
    @PropertyName("sort-name")
    private String sortName;
    private String type;

    public JBand(){}

}
