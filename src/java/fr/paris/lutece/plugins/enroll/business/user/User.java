package fr.paris.lutece.plugins.enroll.business.user;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import fr.paris.lutece.plugins.enroll.business.enrollment.Enrollment;

/**
 * Business class of the User
 *
 * @author Evan Hsia
 *
 */
public class User implements Serializable
{

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -5088753000751258184L;

    /**
     * User Id
     */
    private int _nIdUser;

    /**
     * GUID
     */
    private String _strGuid;

    /**
     * First name of the User
     */
    @NotBlank( message = "enroll.validation.project.FirstName.notEmpty" )
    @Size( max = 255, message = "enroll.validation.project.FirstName.size" )
    private String _strFirstName;

    /**
     * Last name of the User
     */
    @NotBlank( message = "enroll.validation.project.LastName.notEmpty" )
    @Size( max = 255, message = "enroll.validation.project.LastName.size" )
    private String _strLastName;

    /**
     * Email of the User
     */
    @Size( max = 255, message = "enroll.validation.project.Email.size" )
    @Email( message = "enroll.validation.project.Email.email" )
    private String _strEmail;

    /**
     * Phone number of the User
     */
    private String _strPhoneNumber;

    /**
     * Enrollments of the User
     */
    private List<Enrollment> _listEnrollments;

    /**
     * Get the Id of the User
     *
     * @return the Id of the User
     */
    public int getIdUser( )
    {
        return _nIdUser;
    }

    /**
     * Set the Id of the User
     *
     * @param nIdUser
     *            the Id to set
     */
    public void setIdUser( int nIdUser )
    {
        this._nIdUser = nIdUser;
    }

    /**
     * Get the Guid of the User
     *
     * @return the Guid
     */
    public String getGuid( )
    {
        return _strGuid;
    }

    /**
     * Set the Guid
     *
     * @param strGuid
     *            the Guid
     */
    public void setGuid( String strGuid )
    {
        this._strGuid = strGuid;
    }

    /**
     * Get the first name of the User
     *
     * @return the first name of the User
     */
    public String getFirstName( )
    {
        return _strFirstName;
    }

    /**
     * Set the User first name
     *
     * @param strFirstName
     *            the first name to set
     */
    public void setFirstName( String strFirstName )
    {
        this._strFirstName = strFirstName;
    }

    /**
     * Get the last name of the User
     *
     * @return the last name of the USer
     */
    public String getLastName( )
    {
        return _strLastName;
    }

    /**
     * Set the last name of the User
     *
     * @param strLastName
     *            the last name to set
     */
    public void setLastName( String strLastName )
    {
        this._strLastName = strLastName;
    }

    /**
     * Get the email of the User
     *
     * @return the email of the User
     */
    public String getEmail( )
    {
        return _strEmail;
    }

    /**
     * Set the email of the User
     *
     * @param strEmail
     *            the email to set
     */
    public void setEmail( String strEmail )
    {
        this._strEmail = strEmail;
    }

    /**
     * Get the phone number of the USer
     *
     * @return the phone number of the User
     */
    public String getPhoneNumber( )
    {
        return _strPhoneNumber;
    }

    /**
     * Set the phone number of the User
     *
     * @param strPhoneNumber
     *            the phone number to set
     */
    public void setPhoneNumber( String strPhoneNumber )
    {
        this._strPhoneNumber = strPhoneNumber;
    }

    /**
     * Get the enrollments of the User
     *
     * @return the list of the User enrollments
     */
    public List<Enrollment> getEnrollments( )
    {
        return _listEnrollments;
    }

    /**
     * Set the enrollments of the User
     *
     * @param listEnrollments
     *            the enrollments to set
     */
    public void setEnrollments( List<Enrollment> listEnrollments )
    {
        this._listEnrollments = listEnrollments;
    }

}
