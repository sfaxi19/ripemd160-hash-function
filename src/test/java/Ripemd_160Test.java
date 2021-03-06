import static org.junit.Assert.assertEquals;

/**
 * Created by sfaxi19 on 03.03.17.
 */
public class Ripemd_160Test {

    @org.junit.Test
    public void testGetHashCode() throws Exception {
        Ripemd_160 rmd160 = new Ripemd_160();
        assertEquals(rmd160.getHashCodeString(""), "9c1185a5c5e9fc54612808977ee8f548b2258d31");
        assertEquals(rmd160.getHashCodeString("a"), "0bdc9d2d256b3ee9daae347be6f4dc835a467ffe");
        assertEquals(rmd160.getHashCodeString("abc"), "8eb208f7e05d987a9b044a8e98c6b087f15a0bfc");
        assertEquals(rmd160.getHashCodeString("message digest"), "5d0689ef49d2fae572b881b123a85ffa21595f36");
        assertEquals(rmd160.getHashCodeString("abcdefghijklmnopqrstuvwxyz"), "f71c27109c692c1b56bbdceb5b9d2865b3708dbc");
        assertEquals(rmd160.getHashCodeString("abcdbcdecdefdefgefghfghighijhijkijkljklmklmnlmnomnopnopq"), "12a053384a9c0c88e405a06c27dcf49ada62eb2b");
        assertEquals(rmd160.getHashCodeString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"), "b0e20b6e3116640286ed3a87a5713079b21f5189");

    }

}