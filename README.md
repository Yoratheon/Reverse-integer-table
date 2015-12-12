# Reverse-integer-table

Reverse integer table

Algo : reverse tab

int []in;<br />
int i;<br />
<br />
<pre>
for(i = 0; i < in.length/2; i++)
{
	in[i] = in[in.length-i-1]+in[i];
	in[in.length-i-1] = in[i]-in[in.length-i-1];
	in[i] = in[i]-in[in.length-i-1];
}
</pre>
