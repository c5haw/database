/**

Copyright (C) SYSTAP, LLC 2006-2011.  All rights reserved.

Contact:
     SYSTAP, LLC
     4501 Tower Road
     Greensboro, NC 27410
     licenses@bigdata.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
/*
 * Created on Feb 11, 2011
 */

package com.bigdata.rdf.error;

/**
 * A SPARQL error detected by static analysis.
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 * @version $Id$
 */
public class SparqlStaticErrorException extends W3CQueryLanguageException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param errorCode
     *            The four digit error code.
     */
    public SparqlStaticErrorException(final int errorCode) {

        super(LanguageFamily.SP, ErrorCategory.ST, errorCode, (String) null/* msg */);

    }

    static protected String toURI(final int errorCode) {

        return W3CQueryLanguageException.toURI(LanguageFamily.SP,
                ErrorCategory.ST, errorCode, null/* params */);

    }
}
