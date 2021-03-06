/* ClipInterface.java
 * Component: ProperJavaRDP
 * 
 * Revision: $Revision: 1.1 $
 * Author: $Author: brett $
 * Date: $Date: 2011/11/28 14:13:42 $
 *
 * Copyright (c) 2005 Propero Limited
 *
 * Purpose: 
 */
package com.sshtools.javardp.rdp5.cliprdr;

import java.awt.datatransfer.Transferable;

public interface ClipInterface {

	public void copyToClipboard(Transferable t);

	public void send_data(byte[] data, int length);

	public void send_null(int type, int status);
}
