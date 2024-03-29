/*
 * Copyright (c) 2002-2021, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.enroll.business.portlet;

import fr.paris.lutece.plugins.enroll.web.EnrollmentXPage;
import fr.paris.lutece.portal.business.portlet.PortletHtmlContent;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * This class represents business objects EnrollPortlet
 */
public class EnrollPortlet extends PortletHtmlContent
{

    private int _nIdProject;
    /**
     * Sets the identifier of the portlet type to value specified
     */
    public EnrollPortlet(  )
    {
        setPortletTypeId( EnrollPortletHome.getInstance(  ).getPortletTypeId(  ) );
    }

    /**
     * Returns the HTML code of the EnrollPortlet portlet with XML heading
     *
     * @param request The HTTP servlet request
     * @return the HTML code of the EnrollPortlet portlet
     */
    @Override
    public String getHtmlContent( HttpServletRequest request )
    {
      if ( request != null )
      {
          return  new EnrollmentXPage().getEnrollmentHtml( request ).getContent();
      }
      return StringUtils.EMPTY;
    }

    /**
     * Updates the current instance of the EnrollPortlet object
     */
    public void update(  )
    {
        EnrollPortletHome.getInstance(  ).update( this );
    }

    /**
     * Removes the current instance of the EnrollPortlet object
     */
    @Override
    public void remove(  )
    {
        EnrollPortletHome.getInstance(  ).remove( this );
    }

    /**
     * Get the id of the project to display
     *
     * @return The id of the project to display
     */
    public int getIdProject( )
    {
        return _nIdProject;
    }

    /**
     * Set the id of the project form to display
     *
     * @param nIdProject
     *            The id of the appointment form to display
     */
    public void setIdProject( int nIdProject )
    {
        this._nIdProject = nIdProject;
    }
}
