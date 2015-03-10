package org.motechproject.csd.domain;

import org.joda.time.DateTime;
import org.motechproject.csd.adapters.DateAdapter;
import org.motechproject.csd.adapters.DayOfTheWeekAdapter;
import org.motechproject.csd.adapters.TimeAdapter;
import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

@Entity
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = { "openFlag", "daysOfTheWeek", "beginningHour", "endingHour", "beginEffectiveDate", "endEffectiveDate" })
public class OperatingHours {

    @Field(required = true)
    private boolean openFlag;

    @Field
    private List<DayOfTheWeek> daysOfTheWeek;

    @Field
    private DateTime beginningHour;

    @Field
    private DateTime endingHour;

    @Field(required = true)
    private DateTime beginEffectiveDate;

    @Field
    private DateTime endEffectiveDate;

    public OperatingHours() {
    }

    public OperatingHours(boolean openFlag, DateTime beginEffectiveDate) {
        this.openFlag = openFlag;
        this.beginEffectiveDate = beginEffectiveDate;
    }

    public OperatingHours(boolean openFlag, List<DayOfTheWeek> daysOfTheWeek, DateTime beginningHour, DateTime endingHour, DateTime beginEffectiveDate, DateTime endEffectiveDate) {
        this.openFlag = openFlag;
        this.daysOfTheWeek = daysOfTheWeek;
        this.beginningHour = beginningHour;
        this.endingHour = endingHour;
        this.beginEffectiveDate = beginEffectiveDate;
        this.endEffectiveDate = endEffectiveDate;
    }

    public boolean isOpenFlag() {
        return openFlag;
    }

    @XmlElement(required = true)
    public void setOpenFlag(boolean openFlag) {
        this.openFlag = openFlag;
    }

    public List<DayOfTheWeek> getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    @XmlElement(name = "dayOfTheWeek")
    @XmlSchemaType(name = "integer")
    @XmlJavaTypeAdapter(type = DayOfTheWeek.class, value = DayOfTheWeekAdapter.class)
    public void setDaysOfTheWeek(List<DayOfTheWeek> daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public DateTime getBeginningHour() {
        return beginningHour;
    }

    @XmlElement
    @XmlSchemaType(name = "time")
    @XmlJavaTypeAdapter(type = DateTime.class, value = TimeAdapter.class)
    public void setBeginningHour(DateTime beginningHour) {
        this.beginningHour = beginningHour;
    }

    public DateTime getEndingHour() {
        return endingHour;
    }

    @XmlElement
    @XmlSchemaType(name = "time")
    @XmlJavaTypeAdapter(type = DateTime.class, value = TimeAdapter.class)
    public void setEndingHour(DateTime endingHour) {
        this.endingHour = endingHour;
    }

    public DateTime getBeginEffectiveDate() {
        return beginEffectiveDate;
    }

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(type = DateTime.class, value = DateAdapter.class)
    public void setBeginEffectiveDate(DateTime beginEffectiveDate) {
        this.beginEffectiveDate = beginEffectiveDate;
    }

    public DateTime getEndEffectiveDate() {
        return endEffectiveDate;
    }

    @XmlElement
    @XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(type = DateTime.class, value = DateAdapter.class)
    public void setEndEffectiveDate(DateTime endEffectiveDate) {
        this.endEffectiveDate = endEffectiveDate;
    }

    @Override //NO CHECKSTYLE CyclomaticComplexity
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OperatingHours that = (OperatingHours) o;

        if (openFlag != that.openFlag) {
            return false;
        }
        if (!beginEffectiveDate.equals(that.beginEffectiveDate)) {
            return false;
        }
        if (beginningHour != null ? !beginningHour.equals(that.beginningHour) : that.beginningHour != null) {
            return false;
        }
        if (daysOfTheWeek != null ? !daysOfTheWeek.equals(that.daysOfTheWeek) : that.daysOfTheWeek != null) {
            return false;
        }
        if (endEffectiveDate != null ? !endEffectiveDate.equals(that.endEffectiveDate) : that.endEffectiveDate != null) {
            return false;
        }
        if (endingHour != null ? !endingHour.equals(that.endingHour) : that.endingHour != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = (openFlag ? 1 : 0);
        result = 31 * result + (daysOfTheWeek != null ? daysOfTheWeek.hashCode() : 0);
        result = 31 * result + (beginningHour != null ? beginningHour.hashCode() : 0);
        result = 31 * result + (endingHour != null ? endingHour.hashCode() : 0);
        result = 31 * result + beginEffectiveDate.hashCode();
        result = 31 * result + (endEffectiveDate != null ? endEffectiveDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OperatingHours{" +
                "openFlag=" + openFlag +
                ", daysOfTheWeek=" + daysOfTheWeek +
                ", beginningHour=" + beginningHour +
                ", endingHour=" + endingHour +
                ", beginEffectiveDate=" + beginEffectiveDate +
                ", endEffectiveDate=" + endEffectiveDate +
                '}';
    }
}