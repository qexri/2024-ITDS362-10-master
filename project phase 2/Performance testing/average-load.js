import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
  stages: [
    { duration: '1m', target: 10 }, // 10 users ramping up
    { duration: '3m', target: 10 }, // 10 users steady
    { duration: '1m', target: 0 },  // Ramp down to 0
  ],
  insecureSkipTLSVerify: true,
};

export default function () {
  const res = http.get('https://45.136.236.146/');
  check(res, {
    'status is 200': (r) => r.status === 200,
  });
  sleep(1);
}
