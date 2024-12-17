import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
  stages: [
    { duration: '1m', target: 50 },  // Ramp up to 50 users
    { duration: '30m', target: 50 }, // Hold steady at 50 users for 30 minutes
    { duration: '1m', target: 0 },   // Ramp down to 0
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
