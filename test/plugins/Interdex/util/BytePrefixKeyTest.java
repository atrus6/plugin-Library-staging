/* This code is part of Freenet. It is distributed under the GNU General
 * Public License, version 2 (or at your option any later version). See
 * http://www.gnu.org/ for further details of the GPL. */
package plugins.Interdex.util;

import junit.framework.TestCase;

import java.util.Random;
import java.util.Arrays;

/**
** @author infinity0
*/
public class BytePrefixKeyTest extends TestCase {

	public static Random rnd = new Random();

	public void testBasic()  {
		for (int i=0; i<256; ++i) {
			byte[] bs = new byte[32];
			rnd.nextBytes(bs);
			assertTrue(Arrays.equals(bs, BytePrefixKey.hexToBytes(BytePrefixKey.bytesToHex(bs))));
		}
	}

}