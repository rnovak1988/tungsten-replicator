/**
 * VMware Continuent Tungsten Replicator
 * Copyright (C) 2015 VMware, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *      
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Initial developer(s): Ed Archibald
 * Contributor(s): 
 */

package com.continuent.tungsten.common.exception;

public class DirectoryNotFoundException extends Exception
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public DirectoryNotFoundException()
    {
       
    }

    public DirectoryNotFoundException(String message)
    {
        super(message);
       
    }

    public DirectoryNotFoundException(Throwable cause)
    {
        super(cause);
       
    }

    public DirectoryNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
       
    }

}
